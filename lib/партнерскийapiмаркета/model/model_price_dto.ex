# NOTE: This file is auto generated by OpenAPI Generator 7.8.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule ПартнерскийAPIМаркета.Model.ModelPriceDto do
  @moduledoc """
  Информация о ценах на модель товара.
  """

  @derive Jason.Encoder
  defstruct [
    :avg,
    :max,
    :min
  ]

  @type t :: %__MODULE__{
    :avg => float() | nil,
    :max => float() | nil,
    :min => float() | nil
  }

  def decode(value) do
    value
  end
end

