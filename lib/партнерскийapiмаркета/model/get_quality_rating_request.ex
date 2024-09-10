# NOTE: This file is auto generated by OpenAPI Generator 7.8.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule ПартнерскийAPIМаркета.Model.GetQualityRatingRequest do
  @moduledoc """
  Запрос информации по индексу качества.
  """

  @derive Jason.Encoder
  defstruct [
    :dateFrom,
    :dateTo,
    :campaignIds
  ]

  @type t :: %__MODULE__{
    :dateFrom => Date.t | nil,
    :dateTo => Date.t | nil,
    :campaignIds => [integer()]
  }

  alias ПартнерскийAPIМаркета.Deserializer

  def decode(value) do
    value
     |> Deserializer.deserialize(:dateFrom, :date, nil)
     |> Deserializer.deserialize(:dateTo, :date, nil)
  end
end

