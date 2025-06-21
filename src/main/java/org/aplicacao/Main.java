package org.aplicacao;

import org.aplicacao.dto.EnderecoDto;
import org.aplicacao.servico.ApiServico;

import javax.imageio.IIOException;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {

        ApiServico apiServico = new ApiServico();

        try {
            EnderecoDto enderecoDto = apiServico.getEndereco("11260051");
            System.out.println(enderecoDto.getLogradouro());
        } catch (IIOException e){
            throw new RuntimeException(e);
        } catch (InterruptedException e){
            throw new RuntimeException();
        }
    }
}