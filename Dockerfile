FROM golang:1.19 AS build
WORKDIR /go/src
COPY go ./go
COPY main.go .
COPY go.sum .
COPY go.mod .

ENV CGO_ENABLED=0

RUN go build -o ympa_go_server .

FROM scratch AS runtime
COPY --from=build /go/src/ympa_go_server ./
EXPOSE 8080/tcp
ENTRYPOINT ["./ympa_go_server"]
