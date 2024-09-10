# NOTE: This file is auto generated by OpenAPI Generator 7.8.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule ПартнерскийAPIМаркета.Model.UpdateStockItemDto do
  @moduledoc """
  Информация об остатках товара. 
  """

  @derive Jason.Encoder
  defstruct [
    :count,
    :updatedAt
  ]

  @type t :: %__MODULE__{
    :count => integer(),
    :updatedAt => DateTime.t | nil
  }

  alias ПартнерскийAPIМаркета.Deserializer

  def decode(value) do
    value
     |> Deserializer.deserialize(:updatedAt, :datetime, nil)
  end
end

