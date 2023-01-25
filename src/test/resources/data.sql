-- Product
insert into product(id, name)
values (1L, 'TEST_PRODUCT_001'),
       (2L, 'TEST_PRODUCT_002');

-- Media
insert into media (id, name)
values (1L, 'TEST_MEDIA_001'),
       (2L, 'TEST_MEDIA_002'),
       (3L, 'TEST_MEDIA_003'),
       (4L, 'TEST_MEDIA_004'),
       (5L, 'TEST_MEDIA_005'),
       (6L, 'TEST_MEDIA_006'),
       (7L, 'TEST_MEDIA_007'),
       (8L, 'TEST_MEDIA_008'),
       (9L, 'TEST_MEDIA_009'),
       (10L, 'TEST_MEDIA_010');

-- ProductMedia
insert into product_media (product_id, media_id, sort)
values (1L, 1L, 1),
       (1L, 2L, 2),
       (1L, 3L, 3),
       (1L, 4L, 4),
       (1L, 5L, 5),
       (2L, 5L, 6),
       (2L, 6L, 5),
       (2L, 7L, 4),
       (2L, 8L, 3),
       (2L, 9L, 2),
       (2L, 10L, 1);