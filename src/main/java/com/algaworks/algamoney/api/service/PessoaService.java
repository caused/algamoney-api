package com.algaworks.algamoney.api.service;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.algaworks.algamoney.api.model.Pessoa;
import com.algaworks.algamoney.api.repository.PessoaRepository;

@Service
public class PessoaService {

	private PessoaRepository pessoaRepository;
	
	public PessoaService(PessoaRepository pessoaRepository){
		this.pessoaRepository = pessoaRepository;
	}
	
	public Pessoa atualizar(Long codigo, Pessoa pessoa){
		Optional<Pessoa> pessoaOptional = pessoaRepository.findById(codigo);

		if(pessoaOptional.isPresent()){
			Pessoa pessoaEncontrada = pessoaOptional.get();
			BeanUtils.copyProperties(pessoa, pessoaEncontrada, "codigo");

			pessoaRepository.save(pessoaEncontrada);

			return pessoaEncontrada;
		}else{
			throw new EmptyResultDataAccessException(1);
		}
	}
}
