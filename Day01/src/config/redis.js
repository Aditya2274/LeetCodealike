import { createClient } from 'redis';

const client = createClient({
    username: 'default',
    password: 'rjwenWAP2CNMRaQPDo2K2j8ySgBNyhOy',
    socket: {
        host: 'redis-15899.c305.ap-south-1-1.ec2.redns.redis-cloud.com',
        port: 15899
    }
});

client.on('error', err => console.log('Redis Client Error', err));

export default client 