-module(ympa_erlang_client_price_quarantine_verdict_parameter_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_price_quarantine_verdict_parameter_dto/0]).

-type ympa_erlang_client_price_quarantine_verdict_parameter_dto() ::
    #{ 'name' := ympa_erlang_client_price_quarantine_verdict_param_name_type:ympa_erlang_client_price_quarantine_verdict_param_name_type(),
       'value' := binary()
     }.

encode(#{ 'name' := Name,
          'value' := Value
        }) ->
    #{ 'name' => Name,
       'value' => Value
     }.
