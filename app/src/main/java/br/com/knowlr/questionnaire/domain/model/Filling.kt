package br.com.knowlr.questionnaire.domain.model

import java.util.*


data class Filling (val identifier: String = "", val responsible: String = "", val creationDate: Date, var status:FillingStatus)