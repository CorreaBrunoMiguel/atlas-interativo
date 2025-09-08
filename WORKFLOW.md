# Workflow do Projeto – Atlas Digital Interativo do Brasil

## 1. Git Flow

- Branch principal: `main` (estável)
- Branch de desenvolvimento: `dev`
- Branches de feature: `feature/<nome-da-feature>`
- Branches de bugfix: `bugfix/<descrição>`

## 2. Commits

- Formato: `tipo(escopo): descrição resumida`
- Tipos:
  - `feat`: nova funcionalidade
  - `fix`: correção de bug
  - `chore`: tarefas de setup, scripts ou config
  - `docs`: documentação
  - `test`: testes
- **Regra para Aba 1:** commit único por tópico; commit final ao mudar de branch

## 3. Revisão de código

- Pull Requests obrigatórios para merges em `dev`
- Revisão por pelo menos 1 membro da equipe (ou IA no caso do projeto solo)
- Verificar lint, prettier e testes

## 4. Testes automáticos

- Executar `npm run lint` e `npm run format` antes de qualquer commit
- Scripts de teste integrados (a adicionar nas próximas abas)

## 5. Checklist diário

- Revisão do backlog
- Priorização das tarefas do dia
- Execução dos tópicos do checklist da aba
- Registro de decisões e aprendizados
