-module(ympa_erlang_client_option_values_limited_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_option_values_limited_dto/0]).

-type ympa_erlang_client_option_values_limited_dto() ::
    #{ 'limitingOptionValueId' := integer(),
       'optionValueIds' := list()
     }.

encode(#{ 'limitingOptionValueId' := LimitingOptionValueId,
          'optionValueIds' := OptionValueIds
        }) ->
    #{ 'limitingOptionValueId' => LimitingOptionValueId,
       'optionValueIds' => OptionValueIds
     }.
