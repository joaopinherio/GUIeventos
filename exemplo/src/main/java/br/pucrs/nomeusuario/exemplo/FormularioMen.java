package br.pucrs.nomeusuario.exemplo;


import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Hr;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.*;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Formulario de mensagens")
@Route("/forms")
public class FormularioMen extends VerticalLayout{
    private Button enviar;
    private Button terminar;
    private TextField mensagem;
    private Text mensagens;

    public FormularioMen(){
        add(new H1("Formulario de mensagens"));

        Text text1 = new Text("Envie a sua mensagem");

        mensagem = new TextField("Mensagem");
        enviar = new Button("Enviar");
        enviar.addClickListener(e -> mensagens.setText(mensagem.getValue()));
        terminar = new Button("Terminar");
        terminar.addClickListener(e -> UI.getCurrent().navigate(""));
        mensagens = new Text("Mensagens");
        
        HorizontalLayout botoesLayout = new HorizontalLayout(enviar, terminar);

        add(text1);
        add(mensagem);
        add(botoesLayout);
        add(mensagens);

        

    }


}
