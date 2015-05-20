package tr.edu.hacettepe.bbm490.dao;

import tr.edu.hacettepe.bbm490.domain.BaseEntity;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;
import java.lang.reflect.ParameterizedType;
import java.util.Collection;
import java.util.List;

/**
 * Created by mertcaliskan
 * on 17/12/14.
 */
public abstract class BaseDaoImpl<T extends BaseEntity> implements BaseDao<T> {

    protected Class<T> entityClass;

    @PersistenceContext
    protected EntityManager entityManager;

    @SuppressWarnings("unchecked")
    public BaseDaoImpl() {
        ParameterizedType genericSuperclass = (ParameterizedType) getClass().getGenericSuperclass();
        this.entityClass = (Class<T>) genericSuperclass.getActualTypeArguments()[0];
    }

    @Override
    public Long countQuery() {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Long> q = cb.createQuery(Long.class);
        Root<T> from = q.from(entityClass);
        q.select(cb.count(from));

        return entityManager.createQuery(q).getSingleResult();
    }

    @Override
    public T find(Long id) {
        return entityManager.find(entityClass, id);
    }

    @Override
    public List<T> getAll() {

        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<T> q = cb.createQuery(entityClass);
        Root<T> from = q.from(entityClass);
        q.select(from);
        return entityManager.createQuery(q).getResultList();

    }

    @Override
    public List<T> getAll(int startIndex, int maxResult) {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<T> q = cb.createQuery(entityClass);
        Root<T> from = q.from(entityClass);
        q.select(from);
        return entityManager.createQuery(q).setFirstResult(startIndex).setMaxResults(maxResult).getResultList();

    }

    @Override
    @Transactional
    public void remove(T t) {
        if (!entityManager.contains(t)) {
            t = entityManager.merge(t);
        }
        entityManager.remove(t);
    }

    @Override
    @Transactional
    public void removeAll(Collection<T> tCollection) {
        for (T t : tCollection) {
            entityManager.remove(t);
        }
    }

    @Override
    @Transactional
    public T save(T t) {
        if (t.getId() == null) {
            entityManager.persist(t);
        } else {
            entityManager.merge(t);
        }
        entityManager.flush();

        return null;
    }

    @Override
    @Transactional
    public void saveAll(Collection<T> tCollection) {
        for (T t : tCollection) {
            if (t.getId() == null) {
                entityManager.persist(t);
            } else {
                entityManager.merge(t);
            }
        }
        entityManager.flush();
    }
}