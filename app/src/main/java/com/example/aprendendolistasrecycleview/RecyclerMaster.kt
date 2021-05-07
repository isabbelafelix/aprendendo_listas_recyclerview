package com.example.aprendendolistasrecycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class RecyclerMaster : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_master)
    }
}


/** -------------------------------------------------------------------------
 * COMO COMEÇAR  ??????
 *
 * ADAPTER - VIEWHOLDER     ?????
 *
 * ADAPTER = GERENCIA TODOS OS RECURSOS DINÂMICOS, OU SEJA, TODAS AS COLEÇÕES
 * DE INSERÇÃO, EXCLUSÃO, EDIÇÃO DE DADOS. VAI DIZER PARA O VIEWHOLDER (OUTRO COMPONENTE, O QUE SEGURA A VIEW
 * , RESPONSAVEL POR CADA  TELA, LAYOUT EXPECIFICO DE CADA LINHA DA LIST), DESENHAR A TELA.
 *
 *
 *
 * --------------------------------------------------------------------------
 * EXISTEM 3 FORMAS DE SE TRABALHAR COM O RECYCLERVIEW
 *
 * 1- LINEAR (VERTICAL OU HORIZONTAL)
 * 2- GRID (UM AO LADO DO OUTRO)
 * 3- MOSAICO (MAIORES E MENORES)
 *
 * ------------------------------------------------------------------------------
 * Para manipular esses layouts utiliza-se o manager , ele gerencia o layout.
 *
 * <androidx.recyclerview.widget.RecyclerView
android:id="@+id/recycler_view_master"
android:layout_width="match_parent"
android:background="@color/white"
android:layout_below="@+id/app_bar"
app:layoutManager="androidx.recyclerview.widget.LinearLayoutManager"
android:layout_height="match_parent"/>
 *
 *
 *
 * ------------------------------------------------------------------------------------
 * COMO COLOCAR A LISTA DE DADOS ??????
 *
 * 1° DEFINE O LAYOUT QUE VAI QUERER, DESENHANDO UMA CELULA ESPECIFICA DA LISTA
 * PARA DEPOIS CONSEGUIR MANIPULAR O CONTEÚDO DA LISTA
 *
 * 2° PARA VISUALIZAR UM LAYOUT ESPECIFICO EM UM ITEM ESPECIFICO NO EDITOR GRÁFICO,
 * O ANDROID FACILITA USANDO A TAG DO TOOLS: "LISTITEM". DAI VOCÊ CONSEGUE PRÉ VISUALIZAR
 * COMO FICARIA UMA LISTA DE DADOS SEM TER QUE NECESSARIAMENTE IMPLEMENTAR O VIEW HOLDER E
 * O ADAPTER, UTILIZANDO APENAS A TAG DO TOOLS
 *
 * 3° FINALIZANDO A EDIÇÃO DO LAYOUT DE LISTAS, PODEMOS PEGAR TODA REFERENCIA DOS IDS QUE FORAM CRIADOS
 * NO ARQUIVO XML PARA PODER COMEÇAR A FAZER DE FORMA DINÂMICA, OU SEJA, COM UMA LISTA DE DADOS, SEJA VINDO
 * DO SERVIDOR, SEJA DE LISTA DE DADOS FALSAS EM MEMÓRIA, ETC.
 * PEGAMOS OS DADOS E COMEÇA A PASSAR PRA UMA LISTA, ESSA LISTA VAI SER PASSADA PARA UM COMPONENTE QUE
 * CHAMAMOS DE ADAPTER, RESPONSAVEL POR GERENCIAR TODAS OS CONTEUDOS DINÂMICOS E PEGAR CADA ITEM, CADA VIEW
 * RESPONSAVEL QUE GERENCIAM OS LAYOUTS ESPECIFICOS QUE CHAMADOS DE VIEWHOLDER, OU SEJA, EM LINHAS GERAIS
 * VAMOS TER:
 *
 *      A LISTA DE COLEÇÃO DINÂMICA >>>>>>> ESSAS LISTAS DINÂMICAS VÃO ESTAR DENTRO DO ADAPTER >>>>>>>> ADAPTER VAI GERENCIAR
 *
 *
 */
