package com.senai.engsoft.thumm.spring.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "Tarefa_Model")
public class TarefaModel {
    

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

        @Column(name = "data_criada")
        private Date dataCriada;

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
        public Date getDataCriada() {
            return dataCriada;
        }

        public void setDataCriada(Date dataCriada) {
            this.dataCriada = dataCriada;
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
        public TarefaModel(UUID idTarefa, String nome, String descricao, String checkBoxesIds, UUID idUsuarioAtribuido, String assistentesIds, Date dataCriada, Date dataPrazoFinal, Date dataConclusao) {
            this.idTarefa = idTarefa;
            this.nome = nome;
            this.descricao = descricao;
            this.checkBoxesIds = checkBoxesIds;
            this.idUsuarioAtribuido = idUsuarioAtribuido;
            this.assistentesIds = assistentesIds;
            this.dataCriada = dataCriada;
            this.dataPrazoFinal = dataPrazoFinal;
            this.dataConclusao = dataConclusao;
        }

        // Método toString
        @Override
        public String toString() {
            return "TarefaModel{" +
                    "idTarefa=" + idTarefa +
                    ", nome='" + nome + '\'' +
                    ", descricao='" + descricao + '\'' +
                    ", checkBoxesIds='" + checkBoxesIds + '\'' +
                    ", idUsuarioAtribuido=" + idUsuarioAtribuido +
                    ", assistentesIds='" + assistentesIds + '\'' +
                    ", dataCriada=" + dataCriada +
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
