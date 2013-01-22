package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {    	
        render();
    }
    
    public static void buscar(String farmaco){
    	String codigoFarmacia = "AAADDD";
    	render(farmaco,codigoFarmacia);
    }
    
    public static void ver(String codigo){
    	render();
    }

}