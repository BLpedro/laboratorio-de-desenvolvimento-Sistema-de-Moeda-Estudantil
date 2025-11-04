It seems like I can’t do more advanced data analysis right now. Please try again later.

However, you can easily create the `.md` file manually — just copy the text below into a plain text editor (like VS Code, Notepad++, or any Markdown editor) and save it as **`Historias_de_Usuario.md`**:

---

# Histórias de Usuário

---

## HU01 – Cadastro de Aluno

**Como aluno,**
eu quero realizar meu cadastro no sistema informando meus dados pessoais e acadêmicos,
para poder participar do programa de mérito estudantil.

**Critérios de Aceitação:**

* O aluno deve informar nome, email, CPF, RG, endereço, instituição e curso.
* O sistema deve validar se o email e o CPF já estão cadastrados.
* O sistema deve criar login e senha para o aluno.

---

## HU02 – Receber Moedas

**Como aluno,**
eu quero receber moedas virtuais de meus professores,
para ser reconhecido por meu desempenho e acumular saldo.

**Critérios de Aceitação:**

* O sistema deve registrar o valor e o motivo do envio.
* O aluno deve receber uma notificação por email.
* O saldo do aluno deve ser atualizado automaticamente.

---

## HU03 – Consultar Extrato

**Como aluno,**
eu quero visualizar meu extrato de moedas,
para acompanhar meu saldo e as transações de recebimento e troca.

**Critérios de Aceitação:**

* O extrato deve mostrar data, tipo da operação, valor e descrição.
* O sistema deve exibir o saldo atual.

---

## HU04 – Trocar Moedas por Vantagens

**Como aluno,**
eu quero trocar minhas moedas por produtos ou descontos de empresas parceiras,
para usufruir das recompensas do sistema.

**Critérios de Aceitação:**

* O aluno deve selecionar uma vantagem disponível e confirmar o resgate.
* O valor deve ser debitado do saldo do aluno.
* O sistema deve gerar um código e enviar por email um cupom de troca.
* O sistema deve enviar o mesmo código à empresa parceira.

---

# Histórias de Usuário – Professor

---

## HU05 – Enviar Moedas

**Como professor,**
eu quero enviar moedas a alunos com uma justificativa,
para reconhecer o mérito e engajamento em sala.

**Critérios de Aceitação:**

* O professor deve ter saldo suficiente.
* A justificativa do envio é obrigatória.
* O sistema deve registrar a transação e atualizar os saldos.
* O aluno deve receber um email de notificação.

---

## HU06 – Consultar Extrato de Professor

**Como professor,**
eu quero visualizar meu extrato de moedas,
para acompanhar o histórico de envios realizados.

**Critérios de Aceitação:**

* O extrato deve listar data, aluno, valor e motivo.
* O sistema deve exibir o saldo atual.

---

# Histórias de Usuário – Empresa Parceira

---

## HU07 – Cadastrar Empresa

**Como empresa parceira,**
eu quero realizar meu cadastro no sistema,
para oferecer vantagens aos alunos.

**Critérios de Aceitação:**

* O sistema deve exigir nome, CNPJ, endereço e email.
* A empresa deve criar login e senha.

---

## HU08 – Cadastrar Vantagens

**Como empresa parceira,**
eu quero cadastrar produtos e descontos com foto, descrição e custo em moedas,
para disponibilizá-los aos alunos.

**Critérios de Aceitação:**

* O custo deve ser informado em moedas.
* A vantagem deve ter descrição e imagem obrigatórias.
* As vantagens devem aparecer na lista disponível aos alunos.

---

## HU09 – Receber Email de Resgate

**Como empresa parceira,**
eu quero receber por email as informações de resgate de vantagens,
para validar o cupom apresentado pelo aluno.

**Critérios de Aceitação:**

* O email deve conter nome do aluno, a vantagem e o código de confirmação.
* O email deve ser enviado automaticamente após o resgate.

---

# Regra de Negócio – Moedas Semestrais para Professores

**Descrição:**
O sistema deve creditar automaticamente 1000 moedas no saldo de cada professor a cada novo semestre letivo.

**Regras:**

* O crédito deve ocorrer de forma automática, sem intervenção do professor.
* O sistema deve verificar a data de início de cada semestre.
* O saldo de moedas deve ser acumulativo, não substitutivo.
* A operação deve ser registrada no extrato do professor como “Crédito Semestral”.

---

## HU10 – Autenticação de Acesso

**Como sistema,**
devo permitir que todos os usuários (aluno, professor e empresa parceira) realizem login,
para que possam acessar suas funcionalidades de forma segura.

**Critérios de Aceitação:**

* O login deve exigir email e senha válidos.
* O sistema deve impedir o acesso com credenciais incorretas.
* Deve haver tratamento para tentativas inválidas, como mensagens de erro e bloqueio temporário após múltiplas falhas.
* O sistema deve manter sessões seguras e permitir logout.

---

Se quiser, posso tentar novamente gerar o arquivo `.md` automaticamente quando o ambiente estiver disponível. Deseja que eu tente isso depois?
