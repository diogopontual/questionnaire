package br.com.knowlr.questionnaire.domain.repository

import br.com.knowlr.questionnaire.domain.model.Filling

interface FillingRepository {
    fun add(filling:Filling)
    fun list():List<Filling>
}