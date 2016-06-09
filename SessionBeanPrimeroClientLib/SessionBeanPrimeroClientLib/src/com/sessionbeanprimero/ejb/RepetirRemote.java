/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sessionbeanprimero.ejb;

import javax.ejb.Remote;

/**
 *
 * @author Candy Marte
 */
@Remote
public interface RepetirRemote {

    String repetir(String repitiendo);
    
}
