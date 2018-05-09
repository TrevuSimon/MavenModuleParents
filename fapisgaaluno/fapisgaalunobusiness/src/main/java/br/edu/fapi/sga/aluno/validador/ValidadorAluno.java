package br.edu.fapi.sga.aluno.validador;

import br.edu.fapi.sga.model.Aluno;
import org.apache.commons.lang3.StringUtils;

public class ValidadorAluno {

    public boolean validarCpf(Aluno aluno){
        if(aluno != null && StringUtils.isNotBlank(aluno.getCpf()) && aluno.getCpf().length() >= 11){
            return true;
        }
        return false;
    }

}
