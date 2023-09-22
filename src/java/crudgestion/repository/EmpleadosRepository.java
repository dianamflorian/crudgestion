/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudgestion.repository;

/**
 *
 * @author diana-florian
 */


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import crudgestion.model.Empleados;


@Repository
public interface EmpleadosRepository extends JpaRepository<Empleados, Long> {
}