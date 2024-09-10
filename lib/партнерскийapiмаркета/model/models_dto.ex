# NOTE: This file is auto generated by OpenAPI Generator 7.8.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule ПартнерскийAPIМаркета.Model.ModelsDto do
  @moduledoc """
  Список моделей товаров.
  """

  @derive Jason.Encoder
  defstruct [
    :models
  ]

  @type t :: %__MODULE__{
    :models => [ПартнерскийAPIМаркета.Model.ModelDto.t]
  }

  alias ПартнерскийAPIМаркета.Deserializer

  def decode(value) do
    value
     |> Deserializer.deserialize(:models, :list, ПартнерскийAPIМаркета.Model.ModelDto)
  end
end

