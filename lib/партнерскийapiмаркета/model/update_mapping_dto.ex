# NOTE: This file is auto generated by OpenAPI Generator 7.8.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule ПартнерскийAPIМаркета.Model.UpdateMappingDto do
  @moduledoc """
  Карточка на Маркете, которая, с вашей точки зрения, подходит товару. Чтобы определить идентификатор подходящей карточки, воспользуйтесь поиском в кабинете (**Товары** → **Каталог** → **Загрузить товары**).  По результатам проверки Маркет может привязать товар к более подходящей карточке. 
  """

  @derive Jason.Encoder
  defstruct [
    :marketSku
  ]

  @type t :: %__MODULE__{
    :marketSku => integer() | nil
  }

  def decode(value) do
    value
  end
end

