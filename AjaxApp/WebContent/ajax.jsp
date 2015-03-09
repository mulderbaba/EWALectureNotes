<!DOCTYPE html>
<html>
    <head>
        <script src="http://code.jquery.com/jquery-latest.min.js"></script>
        <script>
            $(document).ready(function() {
                $('#myButton').click(function() {    
                    $.get('ajaxServlet', function(responseText) {
                        $('#myDiv').text(responseText);
                    });
                });
            });
        </script>
    </head>
    <body>
        <button id="myButton">Press</button>
        <div id="myDiv"></div>
    </body>
</html>