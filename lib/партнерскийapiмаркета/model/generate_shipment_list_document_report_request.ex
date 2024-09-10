# NOTE: This file is auto generated by OpenAPI Generator 7.8.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule ПартнерскийAPIМаркета.Model.GenerateShipmentListDocumentReportRequest do
  @moduledoc """
  Данные, необходимые для генерации документа. 
  """

  @derive Jason.Encoder
  defstruct [
    :campaignId,
    :shipmentId,
    :orderIds
  ]

  @type t :: %__MODULE__{
    :campaignId => integer(),
    :shipmentId => integer() | nil,
    :orderIds => [integer()] | nil
  }

  def decode(value) do
    value
  end
end

