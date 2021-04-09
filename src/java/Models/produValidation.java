/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Models;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 *
 * @author KEVIN
 */
public class produValidation implements Validator {

   /**
     *
     * @param type Parametro tipo
     * @return Tipo asignado
     */
    @Override
    public boolean supports(Class<?> type) {
        return Produ.class.isAssignableFrom(type);
    }

    /**
     *
     * @param o Objeto propuesto
     * @param errors Parametro de errores
     */
    @Override
    public void validate(Object o, Errors errors) {
        Produ produ = (Produ)o;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,
                "Marca",
                "required.Marca",
                "El campo Marca es obligatorio");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,
                "Modelo",
                "required.Modelo",
                "El campo Modelo es obligatorio");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,
                "Cilindraje",
                "required.Cilindraje",
                "El campo Cilindraje es obligatorio");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,
                "Precio",
                "required.Precio",
                "El campo Precio es obligatorio");
    }
    
}
