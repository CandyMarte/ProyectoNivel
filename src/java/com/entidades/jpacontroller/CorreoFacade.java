/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.entidades.jpacontroller;

import com.entidades.jpa.Correo;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Candy Marte
 */
@Stateless
public class CorreoFacade extends AbstractFacade<Correo> {
    @PersistenceContext(unitName = "Ultima_PruebaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CorreoFacade() {
        super(Correo.class);
    }
    
}
