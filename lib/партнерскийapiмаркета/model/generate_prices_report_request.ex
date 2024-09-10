# NOTE: This file is auto generated by OpenAPI Generator 7.8.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule ПартнерскийAPIМаркета.Model.GeneratePricesReportRequest do
  @moduledoc """
  Данные, необходимые для генерации отчета.
  """

  @derive Jason.Encoder
  defstruct [
    :businessId,
    :campaignId,
    :categoryIds,
    :creationDateFrom,
    :creationDateTo
  ]

  @type t :: %__MODULE__{
    :businessId => integer() | nil,
    :campaignId => integer() | nil,
    :categoryIds => [integer()] | nil,
    :creationDateFrom => Date.t | nil,
    :creationDateTo => Date.t | nil
  }

  alias ПартнерскийAPIМаркета.Deserializer

  def decode(value) do
    value
     |> Deserializer.deserialize(:creationDateFrom, :date, nil)
     |> Deserializer.deserialize(:creationDateTo, :date, nil)
  end
end

