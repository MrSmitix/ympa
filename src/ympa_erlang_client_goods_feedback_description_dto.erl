-module(ympa_erlang_client_goods_feedback_description_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_goods_feedback_description_dto/0]).

-type ympa_erlang_client_goods_feedback_description_dto() ::
    #{ 'advantages' => binary(),
       'disadvantages' => binary(),
       'comment' => binary()
     }.

encode(#{ 'advantages' := Advantages,
          'disadvantages' := Disadvantages,
          'comment' := Comment
        }) ->
    #{ 'advantages' => Advantages,
       'disadvantages' => Disadvantages,
       'comment' => Comment
     }.
