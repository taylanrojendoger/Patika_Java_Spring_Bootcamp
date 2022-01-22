echo "Postgres Container"
docker run --name patika-postgres \
  -e POSTGRES_USER=patika-user \
  -e POSTGRES_PASSWORD=patika-password \
  -d \
  -p 5432:5432 \
  postgres