# NOTE: This file is auto generated by OpenAPI Generator 7.8.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule ПартнерскийAPIМаркета.Model.PagedReturnsDto do
  @moduledoc """
  Возвраты.
  """

  @derive Jason.Encoder
  defstruct [
    :paging,
    :returns
  ]

  @type t :: %__MODULE__{
    :paging => ПартнерскийAPIМаркета.Model.ForwardScrollingPagerDto.t | nil,
    :returns => [ПартнерскийAPIМаркета.Model.ReturnDto.t]
  }

  alias ПартнерскийAPIМаркета.Deserializer

  def decode(value) do
    value
     |> Deserializer.deserialize(:paging, :struct, ПартнерскийAPIМаркета.Model.ForwardScrollingPagerDto)
     |> Deserializer.deserialize(:returns, :list, ПартнерскийAPIМаркета.Model.ReturnDto)
  end
end

