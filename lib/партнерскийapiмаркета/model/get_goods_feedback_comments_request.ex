# NOTE: This file is auto generated by OpenAPI Generator 7.8.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule ПартнерскийAPIМаркета.Model.GetGoodsFeedbackCommentsRequest do
  @moduledoc """
  Фильтр запроса комментариев отзыва. 
  """

  @derive Jason.Encoder
  defstruct [
    :feedbackId
  ]

  @type t :: %__MODULE__{
    :feedbackId => integer()
  }

  def decode(value) do
    value
  end
end

