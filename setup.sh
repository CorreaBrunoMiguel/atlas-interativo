#!/bin/bash
# Setup inicial do projeto Atlas Digital Interativo do Brasil
# Autor: devCorrea + GPT
# Data: 2024-10-01

echo "Iniciando o setup do projeto Atlas Digital Interativo do Brasil..."

# Backend setup
echo "Configurando o backend..."
cd backend || exit
npm install
cd ..

# Frontend setup
echo "Configurando o frontend..."
cd frontend || exit
npm install
cd ..

echo "Setup concluído com sucesso!"