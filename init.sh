#!/bin/bash

echo "Starting Spring Boot, Prometheus & Grafana..."
docker compose up --build -d

echo "Access services:"
echo "➡ Spring Boot: http://localhost:8080/"
echo "➡ Prometheus: http://localhost:9090/"
echo "➡ Grafana: http://localhost:3000/"
