package br.pucrs.nomeusuario.exemplo;

import com.vaadin.flow.component.*;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Formulario de mensagens")
@Route("/forms")
public class FormularioMen extends VerticalLayout{
    private Button enviar;
    private Button terminar;
    private TextField mensagem;
    private TextField mensagens;

    public FormularioMen(){
        
    }


}
