# NOTE: This file is auto generated by OpenAPI Generator 7.8.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule ПартнерскийAPIМаркета.Model.OrderLiftType do
  @moduledoc """
  Тип подъема заказа на этаж:  * `NOT_NEEDED` — не требуется.  * `MANUAL` — ручной.  * `ELEVATOR` — лифт.  * `CARGO_ELEVATOR` — грузовой лифт.  * `FREE` — любой из перечисленных выше, если включена опция бесплатного подъема.  * `UNKNOWN` — неизвестный тип. 
  """

  @derive Jason.Encoder
  defstruct [
    
  ]

  @type t :: %__MODULE__{
    
  }

  def decode(value) do
    value
  end
end

