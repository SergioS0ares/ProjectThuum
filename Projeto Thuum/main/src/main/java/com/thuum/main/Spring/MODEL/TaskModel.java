package com.thuum.main.Spring.MODEL;

import java.util.Date;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Tarefa_Model")
public class TaskModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idTarefa;

    @Column(name = "nome")
    private String nome;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "lista_checkBoxesIds")
    private String checkBoxesIds;

    @Column(name = "usuario_atribuido")
    private UUID idUsuarioAtribuido;

    @Column(name = "lista_assistentes")
    private String assistentesIds;
    
    @Column(name = "data_criacao")
    private Date dataCriacao;
    
    @Column (name = "data_prazo")
    private Date dataPrazoFinal;
    
    @Column (name = "data_conclusao")
    private Date dataConclusao;
    
    @Column (name = "data_ultima_atualizacao")
    private Date dataAlteracao;

    // Getters
    public UUID getIdTarefa() {
        return idTarefa;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getCheckBoxesIds() {
        return checkBoxesIds;
    }

    public UUID getIdUsuarioAtribuido() {
        return idUsuarioAtribuido;
    }

    public String getAssistentesIds() {
        return assistentesIds;
    }
    
    public Date getDataAlteracao() {
    	return dataAlteracao;
    }

    // Setters
    public void setDataAlteracao(Date date) {
    	this.dataAlteracao = date;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setCheckBoxesIds(String checkBoxesIds) {
        this.checkBoxesIds = checkBoxesIds;
    }

    public void setIdUsuarioAtribuido(UUID idUsuarioAtribuido) {
        this.idUsuarioAtribuido = idUsuarioAtribuido;
    }

    public void setAssistentesIds(String assistentesIds) {
        this.assistentesIds = assistentesIds;
    }

    // Getter e Setter para dates que eu inventei agora
    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Date getDataPrazoFinal() {
        return dataPrazoFinal;
    }

    public void setDataPrazoFinal(Date dataPrazoFinal) {
        this.dataPrazoFinal = dataPrazoFinal;
    }

    public Date getDataConclusao() {
        return dataConclusao;
    }

    public void setDataConclusao(Date dataConclusao) {
        this.dataConclusao = dataConclusao;
    }

    // Construtor
    public TaskModel(UUID idTarefa, String nome, String descricao, String checkBoxesIds, UUID idUsuarioAtribuido, String assistentesIds, Date dataCriacao, Date dataPrazoFinal, Date dataConclusao) {
        this.idTarefa = idTarefa;
        this.nome = nome;
        this.descricao = descricao;
        this.checkBoxesIds = checkBoxesIds;
        this.idUsuarioAtribuido = idUsuarioAtribuido;
        this.assistentesIds = assistentesIds;
        this.dataCriacao = dataCriacao;
        this.dataPrazoFinal = dataPrazoFinal;
        this.dataConclusao = dataConclusao;
    }

    // Método toString
    @Override
    public String toString() {
        return "TaskModel{" +
                "idTarefa=" + idTarefa +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", checkBoxesIds='" + checkBoxesIds + '\'' +
                ", idUsuarioAtribuido=" + idUsuarioAtribuido +
                ", assistentesIds='" + assistentesIds + '\'' +
                ", dataCriacao=" + dataCriacao +
                ", dataPrazoFinal=" + dataPrazoFinal +
                ", dataConclusao=" + dataConclusao +
                ", dataAlteracao=" + dataAlteracao +
                '}';
    }
    
    // Mais metodos que eu meio q esqueci de fazer
	public void setIdTask(UUID id) {
		this.idTarefa = id;
	}

	public String getUsuario() {
		String user = "";
		
		return user;
	}
}
