/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author DARKANGEL
 */
public class GoHomeAction implements ActionInterface{

    @Override
    public String execute(HttpServletRequest request) {
        return "home,jsp";
    }
    
}
 