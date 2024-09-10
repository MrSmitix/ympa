# NOTE: This file is auto generated by OpenAPI Generator 7.8.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule ПартнерскийAPIМаркета.Model.OutletLicensesResponseDto do
  @moduledoc """
  Ответ на запрос информации о лицензиях для точек продаж.
  """

  @derive Jason.Encoder
  defstruct [
    :licenses
  ]

  @type t :: %__MODULE__{
    :licenses => [ПартнерскийAPIМаркета.Model.FullOutletLicenseDto.t]
  }

  alias ПартнерскийAPIМаркета.Deserializer

  def decode(value) do
    value
     |> Deserializer.deserialize(:licenses, :list, ПартнерскийAPIМаркета.Model.FullOutletLicenseDto)
  end
end

