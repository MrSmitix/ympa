# ПартнерскийAPIМаркета

API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

## Building

To install the required dependencies and to build the elixir project, run:

```console
mix local.hex --force
mix do deps.get, compile
```

## Installation

If [available in Hex][], the package can be installed by adding `ympa_elixir_client` to
your list of dependencies in `mix.exs`:

```elixir
def deps do
  [{:ympa_elixir_client, "~> 24.08.29"}]
end
```

Documentation can be generated with [ExDoc][] and published on [HexDocs][]. Once published, the docs can be found at
[https://hexdocs.pm/ympa_elixir_client][docs].

## Configuration

You can override the URL of your server (e.g. if you have a separate development and production server in your
configuration files).

```elixir
config :ympa_elixir_client, base_url: "https://api.partner.market.yandex.ru"
```

Multiple clients for the same API with different URLs can be created passing different `base_url`s when calling
`ПартнерскийAPIМаркета.Connection.new/1`:

```elixir
client = ПартнерскийAPIМаркета.Connection.new(base_url: "https://api.partner.market.yandex.ru")
```

[exdoc]: https://github.com/elixir-lang/ex_doc
[hexdocs]: https://hexdocs.pm
[available in hex]: https://hex.pm/docs/publish
[docs]: https://hexdocs.pm/ympa_elixir_client
