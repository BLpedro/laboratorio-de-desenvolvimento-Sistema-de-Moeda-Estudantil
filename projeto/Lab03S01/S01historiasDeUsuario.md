#  Histórias de Usuário – Aluno

---

## **HU01 – Cadastro de Aluno**

**Como** aluno,  
**eu quero** realizar meu cadastro no sistema informando meus dados pessoais e acadêmicos,  
**para** poder participar do programa de mérito estudantil.

###  Critérios de Aceitação:
- O aluno deve informar **nome, email, CPF, RG, endereço, instituição e curso**.  
- O sistema deve **validar se o email e CPF já estão cadastrados**.  
- O sistema deve **criar um login e senha** para o aluno.

---

## **HU02 – Receber Moedas**

**Como** aluno,  
**eu quero** receber moedas virtuais de meus professores,  
**para** ser reconhecido por meu desempenho e acumular saldo.

###  Critérios de Aceitação:
- O sistema deve **registrar o valor e o motivo do envio**.  
- O aluno deve **receber uma notificação por email**.  
- O **saldo do aluno deve ser atualizado automaticamente**.

---

## **HU03 – Consultar Extrato**

**Como** aluno,  
**eu quero** visualizar meu extrato de moedas,  
**para** acompanhar meu saldo e as transações de recebimento e troca.

###  Critérios de Aceitação:
- O extrato deve mostrar **data, tipo da operação, valor e descrição**.  
- O sistema deve **exibir o saldo atual**.

---

## **HU04 – Trocar Moedas por Vantagens**

**Como** aluno,  
**eu quero** trocar minhas moedas por produtos ou descontos de empresas parceiras,  
**para** usufruir das recompensas do sistema.

###  Critérios de Aceitação:
- O aluno deve **selecionar uma vantagem disponível e confirmar o resgate**.  
- O valor deve ser **debitado do saldo do aluno**.  
- O sistema deve **gerar um código e enviar por email um cupom de troca**.  
- O sistema deve **enviar o mesmo código à empresa parceira**.

---

## **HU05 – Autenticar Acesso**

**Como** aluno,  
**eu quero** fazer login no sistema,  
**para** acessar minhas informações e realizar trocas de moedas.

###  Critérios de Aceitação:
- O login deve **exigir email e senha válidos**.  
- O sistema deve **impedir o acesso com credenciais incorretas**.

---

#  Histórias de Usuário – Professor

---

## **HU06 – Enviar Moedas**

**Como** professor,  
**eu quero** enviar moedas a alunos com uma justificativa,  
**para** reconhecer o mérito e engajamento em sala.

###  Critérios de Aceitação:
- O professor deve **ter saldo suficiente**.  
- A **justificativa do envio é obrigatória**.  
- O sistema deve **registrar a transação e atualizar os saldos**.  
- O aluno deve **receber um email de notificação**.

---

## **HU07 – Consultar Extrato de Professor**

**Como** professor,  
**eu quero** visualizar meu extrato de moedas,  
**para** acompanhar o histórico de envios realizados.

###  Critérios de Aceitação:
- O extrato deve listar **data, aluno, valor e motivo**.  
- O sistema deve **exibir o saldo atual**.

---

## **HU08 – Receber Moedas Semestrais**

**Como** professor,  
**eu quero** receber automaticamente **1000 moedas a cada semestre**,  
**para** continuar recompensando meus alunos.

###  Critérios de Aceitação:
- O sistema deve **somar 1000 moedas ao saldo atual do professor a cada semestre**.  
- O sistema deve **garantir que o saldo seja acumulativo**.

---

## **HU09 – Autenticar Acesso**

**Como** professor,  
**eu quero** autenticar meu acesso,  
**para** realizar o envio e controle das moedas de forma segura.

### Critérios de Aceitação:
- O sistema deve **exigir login e senha válidos**.  
- Deve haver **tratamento para tentativas de login inválidas**.

---

#  Histórias de Usuário – Empresa Parceira

---

## **HU10 – Cadastrar Empresa**

**Como** empresa parceira,  
**eu quero** realizar meu cadastro no sistema,  
**para** oferecer vantagens aos alunos.

### Critérios de Aceitação:
- O sistema deve exigir **nome, CNPJ, endereço e email**.  
- A empresa deve **criar login e senha**.

---

## **HU11 – Cadastrar Vantagens**

**Como** empresa parceira,  
**eu quero** cadastrar produtos e descontos com **foto, descrição e custo em moedas**,  
**para** disponibilizá-los aos alunos.

### Critérios de Aceitação:
- O **custo deve ser informado em moedas**.  
- A vantagem deve ter **descrição e imagem obrigatórias**.  
- As vantagens devem **aparecer na lista disponível aos alunos**.

---

## **HU12 – Receber Email de Resgate**

**Como** empresa parceira,  
**eu quero** receber por email as informações de resgate de vantagens,  
**para** validar o cupom apresentado pelo aluno.

###  Critérios de Aceitação:
- O email deve conter **nome do aluno, a vantagem e o código de confirmação**.  
- O email deve ser **enviado automaticamente após o resgate**.
