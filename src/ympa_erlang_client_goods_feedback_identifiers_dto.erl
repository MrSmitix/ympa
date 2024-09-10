-module(ympa_erlang_client_goods_feedback_identifiers_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_goods_feedback_identifiers_dto/0]).

-type ympa_erlang_client_goods_feedback_identifiers_dto() ::
    #{ 'orderId' := integer(),
       'modelId' := integer()
     }.

encode(#{ 'orderId' := OrderId,
          'modelId' := ModelId
        }) ->
    #{ 'orderId' => OrderId,
       'modelId' => ModelId
     }.
