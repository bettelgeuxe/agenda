package co.iotechnologies.tareas.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import co.iotechnologies.tareas.model.Tarea;

public interface TareaRepository extends MongoRepository<Tarea, String> {
	

}
