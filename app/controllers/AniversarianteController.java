package controllers;

import play.mvc.*;
import play.mvc.Result;
import views.html.*;

public class AniversarianteController extends Controller {

    public Result salvaNovoAniversariante(){

        return ok("Formulario recebido");


    }

    public Result formaniversariante(){


        return ok(formaniversariante.render("Your new application is ready."));
    }



}
