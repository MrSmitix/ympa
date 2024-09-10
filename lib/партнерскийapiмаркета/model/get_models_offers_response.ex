# NOTE: This file is auto generated by OpenAPI Generator 7.8.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule ПартнерскийAPIМаркета.Model.GetModelsOffersResponse do
  @moduledoc """
  Ответ на запрос списка предложений для моделей.
  """

  @derive Jason.Encoder
  defstruct [
    :models,
    :currency,
    :regionId
  ]

  @type t :: %__MODULE__{
    :models => [ПартнерскийAPIМаркета.Model.EnrichedModelDto.t],
    :currency => ПартнерскийAPIМаркета.Model.CurrencyType.t | nil,
    :regionId => integer() | nil
  }

  alias ПартнерскийAPIМаркета.Deserializer

  def decode(value) do
    value
     |> Deserializer.deserialize(:models, :list, ПартнерскийAPIМаркета.Model.EnrichedModelDto)
     |> Deserializer.deserialize(:currency, :struct, ПартнерскийAPIМаркета.Model.CurrencyType)
  end
end

