# NOTE: This file is auto generated by OpenAPI Generator 7.8.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule ПартнерскийAPIМаркета.Model.FeedbackFactorDto do
  @moduledoc """
  Информация об оценках по параметрам, указанных в отзыве.  При создании отзыва автору предлагается поставить оценки магазину по нескольким параметрам: например, за скорость обработки заказа или удобство самовывоза. Набор параметров зависит от того, какой способ покупки (параметр `delivery`) указал автор. 
  """

  @derive Jason.Encoder
  defstruct [
    :id,
    :title,
    :description,
    :value
  ]

  @type t :: %__MODULE__{
    :id => integer() | nil,
    :title => String.t | nil,
    :description => String.t | nil,
    :value => integer() | nil
  }

  def decode(value) do
    value
  end
end

