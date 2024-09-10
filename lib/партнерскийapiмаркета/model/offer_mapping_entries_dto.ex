# NOTE: This file is auto generated by OpenAPI Generator 7.8.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule ПартнерскийAPIМаркета.Model.OfferMappingEntriesDto do
  @moduledoc """
  Информация о товарах в каталоге.
  """

  @derive Jason.Encoder
  defstruct [
    :paging,
    :offerMappingEntries
  ]

  @type t :: %__MODULE__{
    :paging => ПартнерскийAPIМаркета.Model.ScrollingPagerDto.t | nil,
    :offerMappingEntries => [ПартнерскийAPIМаркета.Model.OfferMappingEntryDto.t]
  }

  alias ПартнерскийAPIМаркета.Deserializer

  def decode(value) do
    value
     |> Deserializer.deserialize(:paging, :struct, ПартнерскийAPIМаркета.Model.ScrollingPagerDto)
     |> Deserializer.deserialize(:offerMappingEntries, :list, ПартнерскийAPIМаркета.Model.OfferMappingEntryDto)
  end
end

