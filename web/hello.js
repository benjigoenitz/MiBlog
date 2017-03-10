$(document).ready(function() {
    $.ajax({
        url: "http://localhost:8080/MiBlog/api/articulos/1"
    }).then(function(data) {
       $('.greeting-id').append(data.autor);
       $('.greeting-content').append(data.contenido);
    });
});