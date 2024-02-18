INSERT INTO "public"."swtvap_clients" (id, name, address, phone, cellphone, country_code, email, whatsapp, details,source_aggregate) VALUES (1,'Mayra Sanchez','Av. Los Heroes 1203,San Juan de Miraflores,Lima', '011745684','961075081','+51','msanchez90@gmail.com',true,'All ok', 0);
INSERT INTO "public"."swtvap_clients" (id, name, address, phone, cellphone, country_code, email, whatsapp, details,source_aggregate) VALUES (2,'Pedro Trujillo','Av. Defensores del Morro 152,Chorrillos, Lima', '011984848','961478981','+51','p_trujillo@gmail.com',false,'All ok', 1);
INSERT INTO "public"."swtvap_clients" (id, name, address, phone, cellphone, country_code, email, whatsapp, details,source_aggregate) VALUES (3,'Franklin Gomez','Av. del Pinar 650,Miraflores, Lima', '018123562','900514845','+51','fgomez_123@gmail.com',false,'All ok', 0);

INSERT INTO "public"."swtvap_orders" (id,client_id,code,order_date,status,address,subtotal,taxes,discount_amount,total,pick_up) VALUES (1,1,'ORDER-00000001','06-01-2023 17:00:54',1,'Av. los heroes 1203 , SJM',100.39,10.2,5.10,110.80,true);
INSERT INTO "public"."swtvap_orders" (id,client_id,code,order_date,status,address,subtotal,taxes,discount_amount,total,pick_up) VALUES (2,2,'ORDER-00000002','06-01-2023 17:00:54',1,'Av. los cedros 1123 , SPM',100.39,10.2,5.10,110.80,true);
INSERT INTO "public"."swtvap_orders" (id,client_id,code,order_date,status,address,subtotal,taxes,discount_amount,total,pick_up) VALUES (3,3,'ORDER-00000003','06-01-2023 17:00:54',1,'Av. los pinares 3321, SJL',100.39,10.2,5.10,110.80,false);

INSERT INTO "public"."swtvap_providers" (id, name, address, phone, cellphone, country_code, email, whatsapp, details, status) VALUES (1,'CHARSAC','Av. del Pinar 650,Miraflores, Lima', '018123562','900514845','+51','charsac@gmail.com', true,'All ok', 1);
INSERT INTO "public"."swtvap_providers" (id, name, address, phone, cellphone, country_code, email, whatsapp, details, status) VALUES (2,'PRINSAC','Av. Defensores del Morro 152,Chorrillos, Lima, Lima', '018123562','900514845','+51','prinsac@gmail.com', true,'All ok', 0);
INSERT INTO "public"."swtvap_providers" (id, name, address, phone, cellphone, country_code, email, whatsapp, details, status) VALUES (3,'MAGENSA','Av. Argentina 990, Cercado de Lima, Lima', '014334848','900514845','+51','magensa@magensa.com', false,'All ok', 1);

INSERT INTO "public"."swtvap_dispatches" (id,order_id, provider_id, cost, date, status) VALUES (1, 1, 1, 100.00, '2024-01-29 12:30:00', 2);
INSERT INTO "public"."swtvap_dispatches" (id,order_id, provider_id, cost, date, status) VALUES (2, 2, 2, 150.50, '2024-01-30 09:45:00', 3);
INSERT INTO "public"."swtvap_dispatches" (id,order_id, provider_id, cost, date, status) VALUES (3, 3, 3, 200.75, '2024-02-01 15:20:00', 1);
INSERT INTO "public"."swtvap_dispatches" (id,order_id, provider_id, cost, date, status) VALUES (4, 3, 1, 120.25, '2024-02-02 08:10:00', 0);
INSERT INTO "public"."swtvap_dispatches" (id,order_id, provider_id, cost, date, status) VALUES (5, 2, 2, 180.90, '2024-02-03 14:55:00', 6);

