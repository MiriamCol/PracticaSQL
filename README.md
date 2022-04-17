# Practica Persistencia de Queries
Miriam Colino Ruipérez-201804334 3ºA GITT 

En esta práctica se pedía un desarrollo de una App de Spring Boot que incluya una funcionalidad que permita persistir información utilizando la librería Spring Data JDBC con una base de datos H2. El módulo de persistencia debe incluir las operaciones (INSERT, UPDATE,  SELECT y DELETE)
Las operaciones debe de incluir como mínimo dos operaciones “JOINS”  utilizando la anotación @Query.

- He dividido las carpetas en controller, model, repository y service.

- He creado una clase Participant (simulando un supuesto concurso de Repsol) con atributos: id, name_participant, age y description. Todos estos atributos son los usados en la tabla "PARTICIPANT".

- He usado un  @GetMapping para obtener todos los participantes del concurso, un @GetMapping con id del participante, un @PutMapping para modificar cualquier atributo de un objeto Participante y un @DeleteMapping para eliminarlo.

- Las dos operaciones con @Query utilizo el atributo id y edad.






