-module(ympa_erlang_client_accept_order_cancellation_request).

-export([encode/1]).

-export_type([ympa_erlang_client_accept_order_cancellation_request/0]).

-type ympa_erlang_client_accept_order_cancellation_request() ::
    #{ 'accepted' := boolean(),
       'reason' => ympa_erlang_client_order_cancellation_reason_type:ympa_erlang_client_order_cancellation_reason_type()
     }.

encode(#{ 'accepted' := Accepted,
          'reason' := Reason
        }) ->
    #{ 'accepted' => Accepted,
       'reason' => Reason
     }.
