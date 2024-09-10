# NOTE: This file is auto generated by OpenAPI Generator 7.8.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule ПартнерскийAPIМаркета.Model.OfferCardsContentStatusDto do
  @moduledoc """
  Список товаров с информацией о состоянии карточек.
  """

  @derive Jason.Encoder
  defstruct [
    :offerCards,
    :paging
  ]

  @type t :: %__MODULE__{
    :offerCards => [ПартнерскийAPIМаркета.Model.OfferCardDto.t],
    :paging => ПартнерскийAPIМаркета.Model.ForwardScrollingPagerDto.t | nil
  }

  alias ПартнерскийAPIМаркета.Deserializer

  def decode(value) do
    value
     |> Deserializer.deserialize(:offerCards, :list, ПартнерскийAPIМаркета.Model.OfferCardDto)
     |> Deserializer.deserialize(:paging, :struct, ПартнерскийAPIМаркета.Model.ForwardScrollingPagerDto)
  end
end

