package br.com.demo.recruiting.blocks;

/**
 * Nós criamos um robô que move blocos de uma pilha, move eles horizontalmente e depois desce eles até
 * a primeira posição disponível.
 * Existem 10 posições disponíveis para descer os blocos, numeradas de 0 a 9 e cada posição suporta até 15 blocos.
 *
 * O Robô entende os seguintes comando 'P', 'M'  e 'D'
 * P: Pegar na pilha e mover para posição 0
 * M: Mover para a próxima posição
 * D: Descer e largar o bloco na primeira posição livre
 *
 * Imagem ilustrativa em resource / blocks
 *
 * O Robô deve ser seguro e respeitar as seguintes regras:
 * Sempre existem blocos disponíveis para pegar
 * Se o robô já está segurando um bloco ele retorna a posição 0
 * Ele não ultrapassa a posição 9, o comando M na posição 9 não faz nada
 * Em uma pilha com 15 blocos o comando D não faz nada
 * Se o robô nao tiver nenhum bloco o comando D não faz nada
 * O Robô ignora qualquer comando que não seja P M D
 *
 * Escreva uma função que receba uma String como entrada, representando os comandos para o Robô.
 * Como retorno a função devolve uma String representando a quantidade de blocos
 * e cada posição após executar todos os comandos
 * Entrada = "PMDPMMMDPMDPMMD"
 * Saída = "0211000000"
 */
public class Blocks {
	
	
	
}
