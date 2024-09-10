-module(ympa_erlang_client_offer_content_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_offer_content_dto/0]).

-type ympa_erlang_client_offer_content_dto() ::
    #{ 'offerId' := binary(),
       'categoryId' := integer(),
       'parameterValues' := list()
     }.

encode(#{ 'offerId' := OfferId,
          'categoryId' := CategoryId,
          'parameterValues' := ParameterValues
        }) ->
    #{ 'offerId' => OfferId,
       'categoryId' => CategoryId,
       'parameterValues' => ParameterValues
     }.
