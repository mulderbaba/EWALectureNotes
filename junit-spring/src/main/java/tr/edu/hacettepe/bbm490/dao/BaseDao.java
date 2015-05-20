package tr.edu.hacettepe.bbm490.dao;

import tr.edu.hacettepe.bbm490.domain.BaseEntity;

import java.util.Collection;
import java.util.List;

/**
 * Created by mertcaliskan
 * on 17/12/14.
 */
public interface BaseDao <T extends BaseEntity> {

    Long countQuery();

    T find(Long id);

    List<T> getAll();

    List<T> getAll(int startIndex, int maxResult);

    void remove(T t);

    void removeAll(Collection<T> tCollection);

    T save(T t);

    void saveAll(Collection<T> tCollection);
}